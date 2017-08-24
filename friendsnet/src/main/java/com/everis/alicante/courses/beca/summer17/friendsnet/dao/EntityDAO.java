package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {
	public <E> Iterable<E> findAll();
	public E findById(ID id);
	public void save(E e);
	public void save(Iterable<E> es);
	public void update(E e);
	public void update(Iterable<E> es);
	public void remove(E e);
}
