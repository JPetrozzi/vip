package dev.fs.jpp.vipapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fs.jpp.vipapi.entity.GuestList;

public interface GuestListRepository extends JpaRepository<GuestList, Serializable> {

}
