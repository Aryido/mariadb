package com.aryido.aryidodbtest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The stock value object.
 *
 * @author YunYang Lee
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Table(name = "stock0")
public class Stock0 extends Stock{

}
