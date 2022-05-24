package com.vfcastro.shopproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vfcastro.shopproject.entities.pk.OrderItemPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private final static long serialVersionUID = 1L;

    @EmbeddedId
    private final OrderItemPK id = new OrderItemPK();

    @Getter @Setter
    private Integer quantity;
    @Getter @Setter
    private Double price;

    public OrderItem() {}

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        super();
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }


    public void setProduct(Product product) {
        id.setProduct(product);
    }

}
