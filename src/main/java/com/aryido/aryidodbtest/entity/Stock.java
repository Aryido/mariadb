package com.aryido.aryidodbtest.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * The stock value object.
 *
 * @author YunYang Lee
 */
@Entity
@Data
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Stock {
    @Id
    @Column(name = "STOCK_SYMBOL")
    private String stockSymbol;

    @Column(name = "PRICE")
    private String price;

    @Column(name = "CREATE_TIME")
    private String createTime;
}
