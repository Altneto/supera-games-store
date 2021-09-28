package br.com.supera.game.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.supera.game.store.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
