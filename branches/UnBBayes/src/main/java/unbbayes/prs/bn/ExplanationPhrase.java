/*
 *  UnBBayes
 *  Copyright (C) 2002, 2008 Universidade de Brasilia - http://www.unb.br
 *
 *  This file is part of UnBBayes.
 *
 *  UnBBayes is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  UnBBayes is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with UnBBayes.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package unbbayes.prs.bn;

/**
 * @author M�rio Henrique Paes Vieira (mariohpv@bol.com.br)
 * @version 1.0
 */
public class ExplanationPhrase
{   public static final int TRIGGER_EVIDENCE_TYPE = 0;
    public static final int COMPLEMENTARY_EVIDENCE_TYPE = 2;
    public static final int NA_EVIDENCE_TYPE = 4;
    public static final int NECESSARY_EVIDENCE_TYPE = 1;
    public static final int EXCLUSIVE_EVIDENCE_TYPE = 3;
    private String strPhrase, strNode;
    private int evidenceType;

    public ExplanationPhrase()
    {   this.strPhrase = "";
        this.strNode = "";
        this.evidenceType = NA_EVIDENCE_TYPE;
    }

    public ExplanationPhrase(String strPhrase, String strNode,int evidenceType)
    {   this.strPhrase = strPhrase;
        this.strNode = strNode;
        this.evidenceType = evidenceType;
    }

    /** Altera o tipo de evid�ncia do n� de explica��o.
    *  Os tipos de evid�ncia podem ser:
    *  -   TRIGGER_EVIDENCE_TYPE : n� trigger
    *  -   COMPLEMENTARY_EVIDENCE_TYPE : n� complementar
    *  -   NA_EVIDENCE_TYPE : n� na
    *  -   NECESSARY_EVIDENCE_TYPE : n� necess�rio
    *  -   EXCLUSIVE_EVIDENCE_TYPE : n� exclusivo
    *  @param evidenceType Tipo de evid�ncia
    */
    public void setEvidenceType(int evidenceType)
    {   if ((evidenceType > -1) && (evidenceType < 5))
        {   this.evidenceType = evidenceType;
        }
    }

    /** Retorna o tipo de evid�ncia de um n� de explica��o.
    *  @return Tipo de evid�ncia de um n�.
    */
    public int getEvidenceType()
    {   return evidenceType;
    }

    public void setPhrase(String strPhrase)
    {   this.strPhrase = strPhrase;
    }

    public String getPhrase()
    {   return strPhrase;
    }

    public void setNode(String strNode)
    {   this.strNode = strNode;
    }

    public String getNode()
    {   return strNode;
    }
}