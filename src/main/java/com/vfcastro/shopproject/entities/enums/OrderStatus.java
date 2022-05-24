package com.vfcastro.shopproject.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for(OrderStatus status : OrderStatus.values()) {
            if(status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
