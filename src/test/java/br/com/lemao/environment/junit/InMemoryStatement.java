package br.com.lemao.environment.junit;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import br.com.lemao.environment.model.bicycle.support.BicycleInMemorySupport;
import br.com.lemao.environment.model.biker.support.BikerInMemorySupport;

public class InMemoryStatement extends EnvironmentStatement {

	public InMemoryStatement(Statement statement, Description description) {
		super(statement, description);
	}

	@Override
	protected void after() {
		BikerInMemorySupport.dropObjects();
		BicycleInMemorySupport.dropObjects();
	}
}
