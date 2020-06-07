package com.sandeepmane.lambdacustomobject.person.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sandeepmane.lambdacustomobject.person.model.Person;

public class PersonLambda implements RequestHandler<Person, Person> {

    @Override
    public Person handleRequest(Person person, Context context) {
        
        LambdaLogger logger = context.getLogger();

        logger.log("Person received: "+ person);

        person.setName(person.getName().toLowerCase() + " (modified in Lambda)");

        return person;
    }
    
}