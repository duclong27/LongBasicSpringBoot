package com.example.DuAnBanHang.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    @Size(min = 3, max = 20, message = "Password must be at 3 character")
    String password;
    String fullName;
    LocalDate dateOfBirth;
    String avatar;
    String email;
    String phoneNumber;
    boolean isActive;
}
