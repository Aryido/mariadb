package com.aryido.aryidodbtest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The stock value object.
 *
 * @author YunYang Lee
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@SuperBuilder
@Table(name = "STOCK1")
public class Stock1 extends Stock{

}
