package org.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Relation Class.
 */
@Entity
@Table(name = "sales_items")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "id_sale")
    private Integer idSale;

    @NotNull
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * Class.
     */
    SaleItem() {

    }

    /**
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id id.
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return idSale.
     */
    public Integer getIdSale() {
        return idSale;
    }

    /**
     * @param idSale idSale.
     */
    public void setIdSale(final Integer idSale) {
        this.idSale = idSale;
    }

    /**
     * @return quantity.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity quantity.
     */
    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }
}
