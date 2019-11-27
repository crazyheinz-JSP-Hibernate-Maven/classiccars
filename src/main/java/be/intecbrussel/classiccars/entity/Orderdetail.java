package be.intecbrussel.classiccars.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "orderdetails")
public class Orderdetail implements Serializable {


    @Id
    @ManyToOne
    @JoinColumn(name = "productCode")
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name = "orderNumber")
    private Order orderNumber;
    private int quantityOrdered;
    private BigDecimal priceEach;

    private short orderLineNumber;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Order orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    public short getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(short orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "product=" + product +
                ", orderNumber=" + orderNumber +
                ", quantityOrdered=" + quantityOrdered +
                ", priceEach=" + priceEach +
                ", orderLineNumber=" + orderLineNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderdetail that = (Orderdetail) o;
        return quantityOrdered == that.quantityOrdered &&
                orderLineNumber == that.orderLineNumber &&
                Objects.equals(product, that.product) &&
                Objects.equals(orderNumber, that.orderNumber) &&
                Objects.equals(priceEach, that.priceEach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, orderNumber, quantityOrdered, priceEach, orderLineNumber);
    }
}
