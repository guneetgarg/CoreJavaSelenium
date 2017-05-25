<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="PON" select="123456" />
	<xsl:param name="DUE_DATE" />
	<xsl:param name="DT_SENT" />
	<xsl:param name="ICSC" />

	<xsl:param name="CCNA" />
	<xsl:param name="VER" />


	<xsl:output indent="yes" />
	<xsl:strip-space elements="*" />
	<xsl:template match="*|@*|text()">
		<xsl:copy>
			<xsl:apply-templates select="*|@*|text()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="/">
		<xsl:apply-templates />
	</xsl:template>

	<xsl:template match="PON">
		<PON value="{$PON}" />
	</xsl:template>
	<xsl:template match="REMARKS">
		<REMARKS>
			<REMARKS value="{@value}" />
		</REMARKS>
	</xsl:template>
	<xsl:template match="DD">
		<DD value="{$DUE_DATE}" />
	</xsl:template>
	<xsl:template match="DDD">
		<DDD value="{$DUE_DATE}" />
	</xsl:template>
	<xsl:template match="CD">
		<CD value="{$DUE_DATE}" />
	</xsl:template>
	<xsl:template match="DTSENT">
		<DTSENT value="{$DT_SENT}" />
	</xsl:template>
	<xsl:template match="CDTSENT">
		<CDTSENT value="{$DT_SENT}" />
	</xsl:template>
	<xsl:template match="CCNA">
		<CCNA value="{$CCNA}" />
	</xsl:template>
	<!-- <xsl:template match="VER"> </xsl:template> -->

	<xsl:template match="TXID">

	</xsl:template>

	<xsl:template match="RESPONSE_TYPE">

	</xsl:template>
	<xsl:template match="IC">

	</xsl:template>

	<xsl:template match="ICSC">
		<ICSC value="{$ICSC}" />
	</xsl:template>
	<xsl:template match="TELNO">
		<TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../TELNO" />
				<xsl:with-param name="newName" select="'TELNO'" />
			</xsl:call-template>
		</TELNO>
	</xsl:template>
	<xsl:template match="INIT_TELNO">
		<INIT_TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../INIT_TELNO" />
				<xsl:with-param name="newName" select="'INIT_TELNO'" />
			</xsl:call-template>
		</INIT_TELNO>
	</xsl:template>
	<xsl:template match="AP_REP_TELNO">
		<AP_REP_TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../AP_REP_TELNO" />
				<xsl:with-param name="newName" select="'AP_REP_TELNO'" />
			</xsl:call-template>
		</AP_REP_TELNO>
		>
	</xsl:template>
	<xsl:template match="TEL">
		<TEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../TEL" />
				<xsl:with-param name="newName" select="'TEL'" />
			</xsl:call-template>
		</TEL>
	</xsl:template>
	<xsl:template match="ECTEL">
		<ECTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ECTEL" />
				<xsl:with-param name="newName" select="'ECTEL'" />
			</xsl:call-template>
		</ECTEL>
	</xsl:template>
	<xsl:template match="ECMCO">
		<ECMCO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ECMCO" />
				<xsl:with-param name="newName" select="'ECMCO'" />
			</xsl:call-template>
		</ECMCO>
	</xsl:template>
	<xsl:template match="ECOCO">
		<ECOCO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ECOCO" />
				<xsl:with-param name="newName" select="'ECOCO'" />
			</xsl:call-template>
		</ECOCO>
	</xsl:template>
	<!--Response TN fields Ends -->
	<xsl:template match="DSG_TELNO">
		<DSG_TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../DSG_TELNO" />
				<xsl:with-param name="newName" select="'DSG_TELNO'" />
			</xsl:call-template>
		</DSG_TELNO>
	</xsl:template>
	<xsl:template match="BIC_TEL">
		<BIC_TEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../BIC_TEL" />
				<xsl:with-param name="newName" select="'BIC_TEL'" />
			</xsl:call-template>
		</BIC_TEL>
	</xsl:template>
	<xsl:template match="ISTN">
		<ISTN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ISTN" />
				<xsl:with-param name="newName" select="'ISTN'" />
			</xsl:call-template>
		</ISTN>
	</xsl:template>
	<xsl:template match="INIT_FAXNO">
		<INIT_FAXNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../INIT_FAXNO" />
				<xsl:with-param name="newName" select="'INIT_FAXNO'" />
			</xsl:call-template>
		</INIT_FAXNO>
	</xsl:template>
	<xsl:template match="DSG_FAXNO">
		<DSG_FAXNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../DSG_FAXNO" />
				<xsl:with-param name="newName" select="'DSG_FAXNO'" />
			</xsl:call-template>
		</DSG_FAXNO>
	</xsl:template>
	<xsl:template match="CB_TEL_NO">
		<CB_TEL_NO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../CB_TEL_NO" />
				<xsl:with-param name="newName" select="'CB_TEL_NO'" />
			</xsl:call-template>
		</CB_TEL_NO>
	</xsl:template>
	<xsl:template match="MAIN_TELNO">
		<MAIN_TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../MAIN_TELNO" />
				<xsl:with-param name="newName" select="'MAIN_TELNO'" />
			</xsl:call-template>
		</MAIN_TELNO>
	</xsl:template>
	<xsl:template match="IMP_TELNO">
		<IMP_TELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../IMP_TELNO" />
				<xsl:with-param name="newName" select="'IMP_TELNO'" />
			</xsl:call-template>
		</IMP_TELNO>
	</xsl:template>
	<xsl:template match="FIMPTEL">
		<FIMPTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../FIMPTEL" />
				<xsl:with-param name="newName" select="'FIMPTEL'" />
			</xsl:call-template>
		</FIMPTEL>
	</xsl:template>
	<xsl:template match="PDN">
		<PDN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../PDN" />
				<xsl:with-param name="newName" select="'PDN'" />
			</xsl:call-template>
		</PDN>
	</xsl:template>
	<xsl:template match="EUTEL">
		<EUTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../EUTEL" />
				<xsl:with-param name="newName" select="'EUTEL'" />
			</xsl:call-template>
		</EUTEL>
	</xsl:template>
	<xsl:template match="GBTN">
		<GBTN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../GBTN" />
				<xsl:with-param name="newName" select="'GBTN'" />
			</xsl:call-template>
		</GBTN>
	</xsl:template>
	<xsl:template match="GTEL">
		<GTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../GTEL" />
				<xsl:with-param name="newName" select="'GTEL'" />
			</xsl:call-template>
		</GTEL>
	</xsl:template>
	<xsl:template match="CTXTEL">
		<CTXTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../CTXTEL" />
				<xsl:with-param name="newName" select="'CTXTEL'" />
			</xsl:call-template>
		</CTXTEL>
	</xsl:template>
	<xsl:template match="CTX_TEL">
		<CTX_TEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../CTX_TEL" />
				<xsl:with-param name="newName" select="'CTX_TEL'" />
			</xsl:call-template>
		</CTX_TEL>
	</xsl:template>
	<xsl:template match="PRIGBTN">
		<PRIGBTN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../PRIGBTN" />
				<xsl:with-param name="newName" select="'PRIGBTN'" />
			</xsl:call-template>
		</PRIGBTN>
	</xsl:template>
	<xsl:template match="PRIGTEL">
		<PRIGTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../PRIGTEL" />
				<xsl:with-param name="newName" select="'PRIGTEL'" />
			</xsl:call-template>
		</PRIGTEL>
	</xsl:template>
	<xsl:template match="SECGBTN">
		<SECGBTN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../SECGBTN" />
				<xsl:with-param name="newName" select="'SECGBTN'" />
			</xsl:call-template>
		</SECGBTN>
	</xsl:template>
	<xsl:template match="SECGTEL">
		<SECGTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../SECGTEL" />
				<xsl:with-param name="newName" select="'SECGTEL'" />
			</xsl:call-template>
		</SECGTEL>
	</xsl:template>
	<xsl:template match="ACTEL">
		<ACTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ACTEL" />
				<xsl:with-param name="newName" select="'ACTEL'" />
			</xsl:call-template>
		</ACTEL>
	</xsl:template>
	<xsl:template match="AACTEL">
		<AACTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../AACTEL" />
				<xsl:with-param name="newName" select="'AACTEL'" />
			</xsl:call-template>
		</AACTEL>
	</xsl:template>
	<xsl:template match="ALCON_TEL">
		<ALCON_TEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../ALCON_TEL" />
				<xsl:with-param name="newName" select="'ALCON_TEL'" />
			</xsl:call-template>
		</ALCON_TEL>
	</xsl:template>
	<xsl:template match="AALCON_TEL">
		<AALCON_TEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../AALCON_TEL" />
				<xsl:with-param name="newName" select="'AALCON_TEL'" />
			</xsl:call-template>
		</AALCON_TEL>
	</xsl:template>
	<xsl:template match="WKTEL">
		<WKTEL>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../WKTEL" />
				<xsl:with-param name="newName" select="'WKTEL'" />
			</xsl:call-template>
		</WKTEL>
	</xsl:template>
	<xsl:template match="TRANSTELNO">
		<TRANSTELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../TRANSTELNO" />
				<xsl:with-param name="newName" select="'TRANSTELNO'" />
			</xsl:call-template>
		</TRANSTELNO>
	</xsl:template>
	<xsl:template match="TTESTTN">
		<TTESTTN>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../TTESTTN" />
				<xsl:with-param name="newName" select="'TTESTTN'" />
			</xsl:call-template>
		</TTESTTN>
	</xsl:template>
	<xsl:template match="SACTELNO">
		<SACTELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../SACTELNO" />
				<xsl:with-param name="newName" select="'SACTELNO'" />
			</xsl:call-template>
		</SACTELNO>
	</xsl:template>
	<xsl:template match="CUSTTELNO">
		<CUSTTELNO>
			<xsl:call-template name="SplitTNFormat">
				<xsl:with-param name="name" select="../CUSTTELNO" />
				<xsl:with-param name="newName" select="'CUSTTELNO'" />
			</xsl:call-template>
		</CUSTTELNO>
	</xsl:template>
	<xsl:template name="SplitTNFormat">
		<xsl:param name="name" />
		<xsl:param name="newName" />
		<xsl:if test="$name/@value != ''">
			<xsl:element name="{$newName}1">
				<xsl:attribute name="value">
                           <xsl:value-of select="substring($name/@value,1,3)" />
                     </xsl:attribute>
			</xsl:element>
			<xsl:variable name="tn1">
				<xsl:choose>
					<xsl:when test="substring($name/@value,4,1)='-'">
						<xsl:value-of select="substring($name/@value,5)" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="substring($name/@value,4)" />
					</xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			<xsl:if test="$tn1 != ''">
				<xsl:element name="{$newName}2">
					<xsl:attribute name="value">
                                <xsl:value-of select="substring($tn1,1,3)" />
                           </xsl:attribute>
				</xsl:element>
				<xsl:variable name="tn2">
					<xsl:choose>
						<xsl:when test="substring($tn1,4,1)='-'">
							<xsl:value-of select="substring($tn1,5)" />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="substring($tn1,4)" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:variable>
				<xsl:if test="$tn2 !='' ">
					<xsl:element name="{$newName}3">
						<xsl:attribute name="value">
                                     <xsl:value-of
							select="substring($tn2,1,4)" />
                                </xsl:attribute>
					</xsl:element>
					<xsl:variable name="tn3">
						<xsl:choose>
							<xsl:when test="substring($tn2,5,1)='-'">
								<xsl:value-of select="substring($tn2,6)" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="substring($tn2,5)" />
							</xsl:otherwise>
						</xsl:choose>
					</xsl:variable>
					<xsl:if test="$tn3 !='' ">
						<xsl:element name="{$newName}4">
							<xsl:attribute name="value">
                                           <xsl:value-of
								select="substring($tn3,1)" />
                                     </xsl:attribute>
						</xsl:element>
					</xsl:if>
				</xsl:if>
			</xsl:if>
		</xsl:if>
	</xsl:template>

</xsl:stylesheet>