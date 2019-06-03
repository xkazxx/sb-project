package com.xkazxx.springboot.springbootproject.service.impl;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_orderMapper;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_order_goodsMapper;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_userMapper;
import com.xkazxx.springboot.springbootproject.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StatServiceImpl implements StatService {

    @Autowired
    Cskaoyan_mall_userMapper cskaoyanMallUserMapper;

    @Autowired
    Cskaoyan_mall_user cskaoyanMallUser;

    @Autowired
    Cskaoyan_mall_orderMapper cskaoyan_mall_orderMapper;

    @Autowired
    Cskaoyan_mall_order_goodsMapper cskaoyan_mall_order_goodsMapper;

    @Override
    public Map queryUserStatmsg() {

        //int limit = statPageMsg.getLimit();
        //int page = statPageMsg.getPage();
        Date date = new Date();
        Map map = new HashMap();  //最外层的map
        Map data = new HashMap();   //嵌套的data map
        Map rows = new HashMap();   //和data同级的rows map
        List rows2 = new ArrayList();  //用来装rouws键值对
        List columns = new ArrayList();
        columns.add("day");
        columns.add("users");

        //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar now = Calendar.getInstance();


        //PageHelper.startPage(page,limit);

        //PageInfo<Cskaoyan_mall_user> pageInfo =
        //        new PageInfo<>(cskaoyanMallUserMapper.getUserList(page,limit,username,mobile));
        //填充数据到内层的rows键值对里（重点关注，因为demo里没有这个数据包信息）
        rows.put("day", sdf.format(now.getTime()));//获取当前时间
        //rows.put("users",pageInfo.getTotal());
        rows.put("users",cskaoyanMallUserMapper.countUserByAddDate());  //根据当前时间计算用户数量
        rows2.add(rows);   //用来装rows键值对
        //填充数据到data键值对里
        data.put("columns",columns);
        data.put("rows",rows2);
        //填充数据到最外层键值对里
        map.put("data",data);
        map.put("errmsg","成功");
        map.put("errno", 0);
        return map;
    }

    @Override
    public Map queryOrderStatmsg() {
        Date date = new Date();
        //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar now = Calendar.getInstance();

        Map map = new HashMap();  //最外层的map
        Map data = new HashMap();   //嵌套的data map
        Map rows = new HashMap();   //和data同级的rows map

        List rows2 = new ArrayList();//装rows用的
        List columns = new ArrayList();
        columns.add("day");
        columns.add("orders");     //订单数量
        columns.add("customers");   //下单用户数量
        columns.add("amount");      //订单总额
        columns.add("pcr");     //客单价

        rows.put("day", sdf.format(now.getTime()));
        rows.put("orders",cskaoyan_mall_orderMapper.selectOrderByOrderId());    //订单数量
        rows.put("customers",cskaoyan_mall_orderMapper.selectOrderUserByUserId());    //下单用户数量
        rows.put("amount",cskaoyan_mall_orderMapper.countOrderAmount());   //订单总额
        rows.put("pcr",(cskaoyan_mall_orderMapper.countOrderAmount())/(cskaoyan_mall_orderMapper.selectOrderUserByUserId()));  //客单价
        rows2.add(rows);
        data.put("columns",columns);
        data.put("rows",rows2);
        map.put("errno", 0);
        map.put("data",data);
        map.put("errmsg","成功");

        return map;
    }

    @Override
    public Map queryGoodsStatmsg() {
        Date date = new Date();
        //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar now = Calendar.getInstance();

        Map map = new HashMap();  //最外层的map
        Map data = new HashMap();   //嵌套的data map
        Map rows = new HashMap();   //和data同级的rows map

        List rows2 = new ArrayList();//装rows用的
        List columns = new ArrayList();
        columns.add("day");     //日期
        columns.add("orders");    //订单数量（未显示）
        columns.add("products");    //下单货品数量(需要用cskaoyan_mall_order_goodsMapper)
        columns.add("amount");     //下单货品总额

        rows.put("day", sdf.format(now.getTime()));
        rows.put("orders",cskaoyan_mall_orderMapper.countOrderAmount());
        rows.put("products",cskaoyan_mall_order_goodsMapper.countTotalGoods());
        rows.put("amount",cskaoyan_mall_orderMapper.countOrderAmount());
        rows2.add(rows);
        data.put("columns",columns);
        data.put("rows",rows2);
        map.put("errno", 0);
        map.put("data",data);
        map.put("errmsg","成功");

        return map;
    }
}
