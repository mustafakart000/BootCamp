package com.saferent.exception.message;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ErrorMessage {
   public static final String ERROR_MESSAGE = "Could not find %s of contact message";
}
