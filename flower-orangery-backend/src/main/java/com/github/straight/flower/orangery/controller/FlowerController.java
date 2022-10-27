package com.github.straight.flower.orangery.controller;

import com.github.straight.flower_orangery.api.FlowerApi;
import com.github.straight.flower_orangery.model.FlowerDisplay;
import com.github.straight.flower_orangery.model.FlowerMutation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;

@Controller
@Validated
public class FlowerController implements FlowerApi {
    @Override
    public ResponseEntity<FlowerDisplay> addFlower(FlowerMutation mutation) {
        return null;
    }

    @Override
    public ResponseEntity<FlowerDisplay> getFlower(String flowerId) {
        return null;
    }
}
