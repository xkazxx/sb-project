/**
 **/
package com.xkazxx.springboot.springbootproject.bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryVO {
    Integer total;
    List items;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }
}
