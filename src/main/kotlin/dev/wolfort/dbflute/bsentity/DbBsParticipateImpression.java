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
 * The entity of PARTICIPATE_IMPRESSION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     participate_impression_id
 *
 * [column]
 *     participate_impression_id, participate_id, has_spoiler, disclosure_range, impression, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_impression_id
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
 * Integer participateImpressionId = entity.getParticipateImpressionId();
 * Integer participateId = entity.getParticipateId();
 * Boolean hasSpoiler = entity.getHasSpoiler();
 * String disclosureRange = entity.getDisclosureRange();
 * String impression = entity.getImpression();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setParticipateImpressionId(participateImpressionId);
 * entity.setParticipateId(participateId);
 * entity.setHasSpoiler(hasSpoiler);
 * entity.setDisclosureRange(disclosureRange);
 * entity.setImpression(impression);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsParticipateImpression extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _participateImpressionId;

    /** participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate} */
    protected Integer _participateId;

    /** has_spoiler: {NotNull, BIT} */
    protected Boolean _hasSpoiler;

    /** disclosure_range: {NotNull, VARCHAR(50)} */
    protected String _disclosureRange;

    /** impression: {NotNull, TEXT(65535)} */
    protected String _impression;

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
        return "participate_impression";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_participateImpressionId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param participateId : UQ, NotNull, INT UNSIGNED(10), FK to participate. (NotNull)
     */
    public void uniqueBy(Integer participateId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("participateId");
        setParticipateId(participateId);
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
        if (obj instanceof DbBsParticipateImpression) {
            DbBsParticipateImpression other = (DbBsParticipateImpression)obj;
            if (!xSV(_participateImpressionId, other._participateImpressionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _participateImpressionId);
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
        sb.append(dm).append(xfND(_participateImpressionId));
        sb.append(dm).append(xfND(_participateId));
        sb.append(dm).append(xfND(_hasSpoiler));
        sb.append(dm).append(xfND(_disclosureRange));
        sb.append(dm).append(xfND(_impression));
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
    public DbParticipateImpression clone() {
        return (DbParticipateImpression)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'participate_impression_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateImpressionId() {
        checkSpecifiedProperty("participateImpressionId");
        return _participateImpressionId;
    }

    /**
     * [set] participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param participateImpressionId The value of the column 'participate_impression_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateImpressionId(Integer participateImpressionId) {
        registerModifiedProperty("participateImpressionId");
        _participateImpressionId = participateImpressionId;
    }

    /**
     * [get] participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @return The value of the column 'participate_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateId() {
        checkSpecifiedProperty("participateId");
        return _participateId;
    }

    /**
     * [set] participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @param participateId The value of the column 'participate_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateId(Integer participateId) {
        registerModifiedProperty("participateId");
        _participateId = participateId;
    }

    /**
     * [get] has_spoiler: {NotNull, BIT} <br>
     * @return The value of the column 'has_spoiler'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getHasSpoiler() {
        checkSpecifiedProperty("hasSpoiler");
        return _hasSpoiler;
    }

    /**
     * [set] has_spoiler: {NotNull, BIT} <br>
     * @param hasSpoiler The value of the column 'has_spoiler'. (basically NotNull if update: for the constraint)
     */
    public void setHasSpoiler(Boolean hasSpoiler) {
        registerModifiedProperty("hasSpoiler");
        _hasSpoiler = hasSpoiler;
    }

    /**
     * [get] disclosure_range: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'disclosure_range'. (basically NotNull if selected: for the constraint)
     */
    public String getDisclosureRange() {
        checkSpecifiedProperty("disclosureRange");
        return convertEmptyToNull(_disclosureRange);
    }

    /**
     * [set] disclosure_range: {NotNull, VARCHAR(50)} <br>
     * @param disclosureRange The value of the column 'disclosure_range'. (basically NotNull if update: for the constraint)
     */
    public void setDisclosureRange(String disclosureRange) {
        registerModifiedProperty("disclosureRange");
        _disclosureRange = disclosureRange;
    }

    /**
     * [get] impression: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'impression'. (basically NotNull if selected: for the constraint)
     */
    public String getImpression() {
        checkSpecifiedProperty("impression");
        return convertEmptyToNull(_impression);
    }

    /**
     * [set] impression: {NotNull, TEXT(65535)} <br>
     * @param impression The value of the column 'impression'. (basically NotNull if update: for the constraint)
     */
    public void setImpression(String impression) {
        registerModifiedProperty("impression");
        _impression = impression;
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
