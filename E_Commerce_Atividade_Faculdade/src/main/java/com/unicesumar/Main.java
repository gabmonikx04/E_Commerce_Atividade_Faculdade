package com.unicesumar;

import com.unicesumar.controller.ControllerE_Commerce;
import com.unicesumar.controller.ControllerE_CommerceProduto;
import com.unicesumar.controller.ControllerE_CommerceUsers;
import com.unicesumar.model.ModelE_Commerce;
import com.unicesumar.entities.Product;
import com.unicesumar.entities.User;
import com.unicesumar.repository.ProductRepository;
import com.unicesumar.repository.UserRepository;
import com.unicesumar.view.ViewE_Commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        new ControllerE_Commerce().start();
    }
}
