package com.etheller.interpreter.ast.definition;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import com.etheller.interpreter.ast.qualifier.JassQualifier;
import com.etheller.interpreter.ast.scope.Scope;
import com.etheller.interpreter.ast.struct.JassStructMemberTypeDefinition;
import com.etheller.interpreter.ast.type.JassTypeToken;
import com.etheller.interpreter.ast.util.JassProgram;

public class JassStructDefinitionBlock implements JassDefinitionBlock {
	private final EnumSet<JassQualifier> qualifiers;
	private final String structName;
	private final JassTypeToken structSuperTypeToken;
	private final List<JassStructMemberTypeDefinition> memberTypeDefinitions = new ArrayList<>();
	private final List<JassMethodDefinitionBlock> methodDefinitions = new ArrayList<>();

	public JassStructDefinitionBlock(final EnumSet<JassQualifier> qualifiers, final String structName,
			final JassTypeToken structSuperTypeToken) {
		this.qualifiers = qualifiers;
		this.structName = structName;
		this.structSuperTypeToken = structSuperTypeToken;
	}

	public void add(final JassStructMemberTypeDefinition memberType) {
		this.memberTypeDefinitions.add(memberType);
	}

	public void add(final JassMethodDefinitionBlock methodDefinition) {
		this.methodDefinitions.add(methodDefinition);
	}

	@Override
	public void define(final Scope scope, final JassProgram jassProgram) {
		scope.defineStruct(this.qualifiers, this.structName, this.structSuperTypeToken, this.memberTypeDefinitions,
				this.methodDefinitions);
	}

}