package com.java.company.BeyondJava8;

public class Question6 {

    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }

    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                // Complex logic with yield
                String refundMessage = "Refund has been issued for the order.";
                yield refundMessage;  // Using yield to return a value from the case
            }
        };
    }

    public static void main(String[] args) {
        // Test the processOrderStatus method
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.SHIPPED));
        System.out.println(processOrderStatus(OrderStatus.REFUNDED));
    }
}

