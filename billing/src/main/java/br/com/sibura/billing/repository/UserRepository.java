package br.com.sibura.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sibura.billing.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
