<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/ScoreReport">
		<html>
			<body>
				<h1 style="color:red;">Student Infomation</h1>
				<table>
					<xsl:for-each select="Student">
						<tr>
							<td>ID:</td>
							<td><xsl:value-of select="ID"></xsl:value-of></td>
						</tr>
						<tr>
							<td>FullName:</td>
							<td><xsl:value-of select="FullName"></xsl:value-of></td>
						</tr>
						<tr>
							<td>Class:</td>
							<td><xsl:value-of select="Class"></xsl:value-of></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><xsl:value-of select="Address"></xsl:value-of></td>
						</tr>
						<tr>
							<td>Sex:</td>
							<td><xsl:value-of select="Sex"></xsl:value-of></td>
						</tr>
						<tr>
							<td>DateBirth:</td>
							<td><xsl:value-of select="DateBirth"></xsl:value-of></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>