package com.example.springbootreactjs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
interface BeerRepository extends JpaRepository<Beer, Long> {
}
