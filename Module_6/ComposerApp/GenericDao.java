/*
    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
 */

import java.util.List;

public interface GenericDao<E, K> {
    List<E> findAll();

    E findBy(K key);

    void insert(E entity);
}
