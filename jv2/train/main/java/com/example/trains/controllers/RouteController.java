package com.example.trains.controllers;

import com.example.trains.models.Route;
import com.example.trains.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    RouteService routeService;

    @GetMapping("")
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Integer id) {
        return routeService.getRoute(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Route route) {
        routeService.save(route);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Route route, @PathVariable Integer id) {
        try {
            routeService.getRoute(id);
            route.setId(id);
            routeService.save(route);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Route>(HttpStatus.NOT_FOUND);
        }
    }

}
