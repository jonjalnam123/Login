package login.service.face;

import login.dto.SomDoongMember;

public interface SomDoongMemberService {

	public void join(SomDoongMember joinproc);

	public boolean login(SomDoongMember member);

	public String getUsername(SomDoongMember member);

	public int idcheck(SomDoongMember member);

	

	

	
	
	




}
