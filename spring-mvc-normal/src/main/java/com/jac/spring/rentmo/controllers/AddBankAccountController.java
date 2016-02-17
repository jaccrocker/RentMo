package com.jac.spring.rentmo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddBankAccountController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AddBankAccountController.class);

    protected static final String VIEW_NAME_ADD_BANK_ACCOUNT = "addBankAccount";
    protected static final String VIEW_NAME_LANDING = "landing";

    @RequestMapping(value="/addBankAccount", method = RequestMethod.GET)
    public String showAddBankAccountPage() {
        LOGGER.debug("Rendering AddBankAccount page.");
        return VIEW_NAME_ADD_BANK_ACCOUNT;
    }
    
    @RequestMapping(value="/landing", method = RequestMethod.GET)
    public String showLandingPage() {
        LOGGER.debug("Rendering Landing page.");
        return VIEW_NAME_LANDING;
    }
}
