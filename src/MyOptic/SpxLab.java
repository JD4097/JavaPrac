package MyOptic;

public class SpxLab {
    public static void main(String[] args) {
        Vflens vf = new Vflens();
        vf.ScaResi();
        vf.Dia();
        vf.Mar();
        vf.BAR();

        Bflens bf = new Bflens();
        bf.ScaResi();
        bf.Dia();
        bf.Mar();
        bf.BAR();

        Svilens op = new Svilens();
        op.ScaResi();
        op.Dia();
        op.Mar();
        op.BAR();

        Svdlens svd = new Svdlens();
        svd.ScaResi();
        svd.Dia();
        svd.Mar();
        svd.BAR();

        Svnlens svn = new Svnlens();
        svn.ScaResi();
        svn.Dia();
        svn.Mar();
        svn.BAR();

    }
}
