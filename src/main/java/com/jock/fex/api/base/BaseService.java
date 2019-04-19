package com.jock.fex.api.base;

public interface BaseService<T> {

    int save(T record) ;  
    
    int update(T record) ;
    
    int delete(Long id) ;
    
    T select(Long id) ;
    
}