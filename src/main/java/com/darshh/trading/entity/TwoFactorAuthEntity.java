package com.darshh.trading.entity;

import com.darshh.trading.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuthEntity {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
