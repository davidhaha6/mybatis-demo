package com;

/**
 * Created by sc on 2018/11/11.
 */
public interface Executor {

    <E> E query(String sql, Object parameter);
}
