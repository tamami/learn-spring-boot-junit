package lab.aikibo.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by tamami on 18/12/16.
 */
@Data
public class Order {

    private int orderId;
    private String description;
    private String securityCode;
    private String orderStatus;
    private Date orderDate;

}
