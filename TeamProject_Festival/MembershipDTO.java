package Membership;

public class MembershipDTO {
	
	// DTO : ������ ����(�̵�) ��ü , DBó���ϴµ� �̿�, ���̺��� �� ���ڵ�
	// �Ѹ��� ȸ�������� �����ϴ� Ŭ����
	
	private String id;
	private String pw;
	private String pwCheck;
	private String sex;
	private String email;
	private String agegroup;
	
	public MembershipDTO(String id, String pw, String pwCheck, String sex, String email, String agegroup) {
		super();
		this.id = id;
		this.pw = pw;
		this.pwCheck = pwCheck;
		this.sex = sex;
		this.email = email;
		this.agegroup = agegroup;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getPwCheck() {
		return pwCheck;
	}

	public String getSex() {
		return sex;
	}

	public String getEmail() {
		return email;
	}

	public String getAgegroup() {
		return agegroup;
	}

}
