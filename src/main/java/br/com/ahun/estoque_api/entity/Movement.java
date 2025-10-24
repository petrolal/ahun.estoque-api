package br.com.ahun.estoque_api.entity;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import models.MovementReason;

@Entity
@Table(name = "tb_movements")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "moved_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp movedAt;

    @Column(name = "reason", nullable = false)
    @Enumerated(EnumType.STRING)
    private MovementReason reason;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    public Movement() {
    }

    public Movement(Long id, Timestamp movedAt, MovementReason reason, Stock stock) {
        this.id = id;
        this.movedAt = movedAt;
        this.reason = reason;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getMovedAt() {
        return movedAt;
    }

    public void setMovedAt(Timestamp movedAt) {
        this.movedAt = movedAt;
    }

    public MovementReason getReason() {
        return reason;
    }

    public void setReason(MovementReason reason) {
        this.reason = reason;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

}
