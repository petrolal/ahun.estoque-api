package br.com.ahun.estoque_api.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_prices")
public class Prices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purshased_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date purshasedAt;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Prices() {
    }

    public Prices(Long id, Double price, Date purshasedAt, Product product) {
        this.id = id;
        this.price = price;
        this.purshasedAt = purshasedAt;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPurshasedAt() {
        return purshasedAt;
    }

    public void setPurshasedAt(Date purshasedAt) {
        this.purshasedAt = purshasedAt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
