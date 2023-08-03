package br.com.learn.strategy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.service.PaymentService;
import br.com.learn.strategy.service.impl.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public void processPayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.processPayment(paymentDTO);
    }
    
}
