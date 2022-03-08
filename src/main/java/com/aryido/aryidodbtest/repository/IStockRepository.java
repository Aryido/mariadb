package com.aryido.aryidodbtest.repository;

import com.aryido.aryidodbtest.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface is used to access all stock's data by extending CrudRepository,
 * which is a class from springframework.data, and it has basing CRUD methods.
 *
 * The type Stock、String represent bean and Id(primary key)
 */
@Repository
public interface IStockRepository<T extends Stock> extends JpaRepository<T, String> {

}
