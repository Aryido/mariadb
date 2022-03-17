package com.aryido.aryidodbtest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author YunYang Lee
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Table
public class Stock1 extends Stock{

}
