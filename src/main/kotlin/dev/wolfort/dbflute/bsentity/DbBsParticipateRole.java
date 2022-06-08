package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of PARTICIPATE_ROLE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     participate_role_id
 *
 * [column]
 *     participate_role_id, participate_id, participate_role_type, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_role_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PARTICIPATE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     participate
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer participateRoleId = entity.getParticipateRoleId();
 * Integer participateId = entity.getParticipateId();
 * String participateRoleType = entity.getParticipateRoleType();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setParticipateRoleId(participateRoleId);
 * entity.setParticipateId(participateId);
 * entity.setParticipateRoleType(participateRoleType);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsParticipateRole extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _participateRoleId;

    /** participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate} */
    protected Integer _participateId;

    /** participate_role_type: {NotNull, VARCHAR(50)} */
    protected String _participateRoleType;

    /** register_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_trace: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** update_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_trace: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "participate_role";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_participateRoleId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PARTICIPATE by my participate_id, named 'participate'. */
    protected OptionalEntity<DbParticipate> _participate;

    /**
     * [get] PARTICIPATE by my participate_id, named 'participate'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'participate'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbParticipate> getParticipate() {
        if (_participate == null) { _participate = OptionalEntity.relationEmpty(this, "participate"); }
        return _participate;
    }

    /**
     * [set] PARTICIPATE by my participate_id, named 'participate'.
     * @param participate The entity of foreign property 'participate'. (NullAllowed)
     */
    public void setParticipate(OptionalEntity<DbParticipate> participate) {
        _participate = participate;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsParticipateRole) {
            DbBsParticipateRole other = (DbBsParticipateRole)obj;
            if (!xSV(_participateRoleId, other._participateRoleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _participateRoleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_participate != null && _participate.isPresent())
        { sb.append(li).append(xbRDS(_participate, "participate")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_participateRoleId));
        sb.append(dm).append(xfND(_participateId));
        sb.append(dm).append(xfND(_participateRoleType));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_participate != null && _participate.isPresent())
        { sb.append(dm).append("participate"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbParticipateRole clone() {
        return (DbParticipateRole)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'participate_role_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateRoleId() {
        checkSpecifiedProperty("participateRoleId");
        return _participateRoleId;
    }

    /**
     * [set] participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param participateRoleId The value of the column 'participate_role_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateRoleId(Integer participateRoleId) {
        registerModifiedProperty("participateRoleId");
        _participateRoleId = participateRoleId;
    }

    /**
     * [get] participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @return The value of the column 'participate_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateId() {
        checkSpecifiedProperty("participateId");
        return _participateId;
    }

    /**
     * [set] participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @param participateId The value of the column 'participate_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateId(Integer participateId) {
        registerModifiedProperty("participateId");
        _participateId = participateId;
    }

    /**
     * [get] participate_role_type: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'participate_role_type'. (basically NotNull if selected: for the constraint)
     */
    public String getParticipateRoleType() {
        checkSpecifiedProperty("participateRoleType");
        return convertEmptyToNull(_participateRoleType);
    }

    /**
     * [set] participate_role_type: {NotNull, VARCHAR(50)} <br>
     * @param participateRoleType The value of the column 'participate_role_type'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateRoleType(String participateRoleType) {
        registerModifiedProperty("participateRoleType");
        _participateRoleType = participateRoleType;
    }

    /**
     * [get] register_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'register_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] register_trace: {NotNull, VARCHAR(64)} <br>
     * @param registerTrace The value of the column 'register_trace'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] update_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'update_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] update_trace: {NotNull, VARCHAR(64)} <br>
     * @param updateTrace The value of the column 'update_trace'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }
}
