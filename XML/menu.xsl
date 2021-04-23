<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/Menu">
		<html>
			<body>
			<h1>Menu Today</h1>
				<table border="1" >
					<tr>
						<th>Name</th>
						<th>Price</th>
						<th>Description</th>
						<th>Calories</th>
					</tr>
					<xsl:for-each select="Food">
						<tr>
							<td><xsl:value-of select="Name"></xsl:value-of></td>
							<td><xsl:value-of select="Price"></xsl:value-of></td>
							<td><xsl:value-of select="Description"></xsl:value-of></td>
							<td><xsl:value-of select="Calories"></xsl:value-of></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>