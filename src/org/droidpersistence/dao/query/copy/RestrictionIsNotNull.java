package org.droidpersistence.dao.query.copy;

class RestrictionIsNotNull extends OperatorRestriction
{

	protected RestrictionIsNotNull(String p_name)
	{
		super(p_name);
	}

	@Override
	protected String getSqlOperation()
	{
		return "is not null";
	}

}
