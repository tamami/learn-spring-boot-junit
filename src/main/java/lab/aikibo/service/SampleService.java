package lab.aikibo.service;

import lab.aikibo.model.Order;

/**
 * Created by tamami on 18/12/16.
 */
public interface SampleService {

    public String getOrderDescription();
    public String getOrderStringCode();
    public Order getOrder(int id);
    public Order createOrder(Order order);

}
