package ru.fortech.ahub.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class JwtResponse {
    private String accessToken;
}
