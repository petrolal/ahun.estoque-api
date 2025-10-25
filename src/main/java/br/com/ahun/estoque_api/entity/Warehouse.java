package br.com.ahun.estoque_api.entity;

import java.util.List;

import br.com.ahun.estoque_api.models.WareshouseTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_warehouses")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "type", nullable = false)
    private WareshouseTypeEnum type;

    @OneToMany(mappedBy = "warehouse")
    private List<Stock> stocks;

    public Warehouse() {
    }

    public Warehouse(Long id, String location, WareshouseTypeEnum type, List<Stock> stocks) {
        this.id = id;
        this.location = location;
        this.type = type;
        this.stocks = stocks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public WareshouseTypeEnum getType() {
        return type;
    }

    public void setType(WareshouseTypeEnum type) {
        this.type = type;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

}
