package cn.ucmed.common.db.system.entity;

/**
 * @author gaoyuzhe
 * @date 2017/12/15.
 */
public class SysUserVO {
    /**
     * 更新的用户对象
     */
    private SysUser userDO = new SysUser();
    /**
     * 旧密码
     */
    private String pwdOld;
    /**
     * 新密码
     */
    private String pwdNew;

    public SysUser getUserDO() {
        return userDO;
    }

    public void setUserDO(SysUser userDO) {
        this.userDO = userDO;
    }

    public String getPwdOld() {
        return pwdOld;
    }

    public void setPwdOld(String pwdOld) {
        this.pwdOld = pwdOld;
    }

    public String getPwdNew() {
        return pwdNew;
    }

    public void setPwdNew(String pwdNew) {
        this.pwdNew = pwdNew;
    }
}
