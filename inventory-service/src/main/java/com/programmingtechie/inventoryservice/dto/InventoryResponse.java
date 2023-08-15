package com.programmingtechie.inventoryservice.dto;


import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;

    private boolean isInStock;
}
