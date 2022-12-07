package login.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.dao.face.SomDoongMemberDao;
import login.dto.SomDoongMember;
import login.service.face.SomDoongMemberService;

@Service
public class SomDoongMemberServiceImpl implements SomDoongMemberService{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired SomDoongMemberDao somDoongMemberDao;


	@Override
	public void join(SomDoongMember joinproc) {
		
		somDoongMemberDao.insert(joinproc);
		
	}
	
	@Override
	public boolean login(SomDoongMember member) {
		
		int loginChk = somDoongMemberDao.selectCntMember(member);
		logger.info("loginChk : {}", loginChk);
		
		if( loginChk > 0) return true;
		return false;
	}
	
	@Override
	public String getUsername(SomDoongMember member) {
		
		return somDoongMemberDao.selectName(member) ;
	}

	
	@Override
	public int idcheck(SomDoongMember member) {

		int result = somDoongMemberDao.idcheck(member);
		
		return result;
	}
	

	@Override
	public SomDoongMember memberIdSearch(SomDoongMember searchMember) {
		
		return somDoongMemberDao.memberIdSearch(searchMember);
	}
	

	@Override
	public SomDoongMember memberPwdCheck(SomDoongMember searchMember) {
		// TODO Auto-generated method stub
		return somDoongMemberDao.memberPwSearch(searchMember);
	}

	
	
	


}
