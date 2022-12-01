package login.dao.face;

import login.dto.SomDoongMember;

public interface SomDoongMemberDao {

	public void insert(SomDoongMember joinproc);

	public int selectCntMember(SomDoongMember member);

	public String selectName(SomDoongMember member);

	public int idcheck(SomDoongMember member);

	



	

}
