package RSlidingWindow;

import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
// https://leetcode.com/problems/find-all-anagrams-in-a-string/

public class CountOccurences {
    public static void main(String[] args) {

        String txt = "gvdzvbswujtwzpvqbogzjsrfqcuuxmpczmprhmuamfuqchosbqdujaxvxpujruczfdqqzzuavomjqohpvqpaufsmcsbmruxmgbhcexuxqwhxhfttvjhyzdevfoxujdmzqhxvamqrhvamxzuouopbusubsjzqcqfcrpmpgfcdxcrzxhfbpuhacramjqzqquzjouxmprugduqocpsfsmcvvbmxzhkzjdyvfmbfoipdmeosscqzpvhurumzarpzcvmcgjuxjdqabfpqoomqfmuubhxancnafsxzbubebvnfhlmpctfwmaubbqhpqquafzucpdupcoxzjgvvfxmqrzcoushrjmmsxhujmjpfvsgqopsucozardbzqmrucpbfmucuhqqzmxavcjvofacxfbsuxbqsqhpahuzgqmmrdpvjmcomuqzupuzrrpuusahcvvmhxjzufmfzacrbjqsummrxoqzgocqpdbupqdtsmozwsradrbfapoocvuugbzxczmhuufphmscujxzqvmpsmjqqqqjupfjbqhbupfqpsmamhzcavgoqomxudvszxruzmrccumbpzrhzfpajouqcgjozvrcpuvxqaduhcmmfuqbxmqsusqbqqcjupouvomhqudhucjpmzsragmfzzxrfsmcpbxvaulikzhvlmjpnouuropmsuqoxhfmjcqprfucmxuzavjzsqpbbqzaugumvhcdjoazruqqmufbsmbcapfzmczpduprxogsjmvxhvuchuqqqvrcfoujusmbzsurmhqxmdzfopqcauzubmqpjxcgphvadhzpxxkmnjlcajmxdouvoamscqxbpgmuvphqhrfzqucbsmujpczzqurfajiobhsbwktbccspqjuzvfmbvpmqmcxzhqquxzabamgroduphcfjrsouuhhsqpqmjszfcvdbugpcoauxczxbzqvuufraqujopmmmrlrnragnldauovgnxqudpjqcbpcqpzoghscrxujmomuzffxauasqhrmmvzqvubwlmhdrpgcozczmhruqaumxspfcfjqbqvuuozbasxjpvqumvhjuuhqzadbcmgcrfuqozcmbrsmoxuspjxmpufvzqapqqrjuspcppmuhqbodmszcvmjzfgqaamxubuqhzcvruxofamvudpbxhzozocqumuqjvsfpqrmfxgujphcmcrsauzbquahqpjsqzqsxczuvubzgucbfrxjoqocmvpummpmdarfhqrgrydabsbvgzosqasqurmmxqbpzuuhrofdujxucccpfjbmmzhpqavxuhaqmfmvxmmvdqpugrscqzbrjojshcqbuozpazfpuucxzvuzuqdhmbmxcjuogzbfspvcqqmfocpuasjpramuqrhkcusmgpqzbqprvuhazdmhjmsxcqfzjfcapuxorvqobmuuwwfkeumrxouslhxwjpvmsrozdvcbjgufpaumuxfrhhzmcmxpbcsazoqjqqquutzrwotonqzzoavsvrdfhsaczqpmghpjqujbmruxqpmcfoumbcuxusjvqoaufbcumcmhmjbzxrphzqrpuqxasufqpugdoczmvuzxhhsrjizszbaczjvcoxmdzjvhfcsmaqhxpfmsuqruuumbqoqgurppbfzdxjvvcpufmsmaacqzguoppouxqjbrhmrusqquczmhzgoubzmpjpuszvovdmcauhuqpxmfxqucrbqazghsfjqrmcnwhrszzugcqcmvdqcjzbhhqmfaupsxvoamfuxmuqpburjprocuzkmqazrqvrbmmospufacgzuuxcupjhqsqbxzphcjufvdomqhgmrucummzhzxupoqcopjavmfdxfusurqqbcjzspvabaovxvguxpmuhzqjzqumcqrafrudpubbpjsqhfmszmoccibsvcowzauxsuomzahprjccgduzzbqjqsomqvvbprmhcqmxfpuuffvymutvmbqqhpzjqqamdrxmprszuucgzxcmuhfpavvjsuobocufmdhzmsuupzjccraqqxbfufomuzjgpxbcasopqvrmvqhuodjujzpgfcrzmqxuumpqqcxupmhubasqzfcrvbovmshakdwvsocqjdufqgmqqhxpbrhupoufmuaxcrzmbzpavumzcjspsalpikolqzcggddlxmiuivnqhfzozgjuvfcmpcpxqsqhcxuhabpqmujrobzaqurmsmduvkzgenayzbwfesfsgfozpeynzsummepjcjpzafbuhqmmxuqczoxqgpqbmuscrauprodhzmfvusvoqptsofucbxrbqcqmhhupzzpsvfuusfqvcajzromampugdmqojxbxayipirvvxcmbjspquxmqcosuzzapucqrbmgouqhjmuhffavdrzprqsjbmvhacuuqhmxoqbcpjpfpurzgzuzvxsaocmmfudqrxbkzbixjubvsmsjvqxcqzhudurazmmpuqpzgjhqxmucopouraffbchmxfvgzzmuuuocabmauqqmphpjfdsqqjozcrrusvcbxpekbjzvvtkbihwrbdelhlisorpjgpxudmcuhcoojhpvafxmqvsmuamcsfrzzuzqqbuqbxpefwtihobmvmqncebqteznmmyccukhdoirtdmnvrdzrmaxpjqubhcbguurmumoxqjvcuvspfqoqzshfzcapmaxquzcjucomrfxvuuzzbpbqvhmjraugpsfpmhqoqdmcsmpozmmejthbuucsxqbpzrpmuqugodrfjhzcqhzxvpavsaubfummjmcoqjarxrvzqompqmjcpxfmcpvgusafsmquuohbubhqcuzzdmpuzaqqhcsavrgfzzjxbmrchupxdsfvumbmquoupjcqohhzxbsjdpqqourmqqvccpujaufmrmovmupczfgbasxuzuzzsbmruqaqpxumozpmarccvmhbqphufxojujgvfdqcshpkclrfgvaxpfchqpzxqofmbohszagmbuzvupscmmuqdjrjruucqbquqzqchfsuxuocpmzpjsrgmvxuavzqahdubjmpfcomrdqcumpgoauxbzmjrumspbsjarmfvuqvxupozqhfchzqcbxvcklxxmpxfqawkrrtqqkoucszphqmgdxmujobvmuzsbfpmchqpfjuxaaqrucqzvrtfmiruyfixucmzfcpdvhqambrjqvuguomuphscqqxoaupszmxfrbjzufzpjsquvocazhsbgorjcfrxmbaphupqmqudmumqvzxcoaqdjuzaoxqupbcxmqmvpujhqrczsgfuhzrbucmspvmfposjuzcdmquuumvpxfbcmzogqmaaujvfcqzsbxrphrhqsxvuujuudrqhfbpcvpozzsfrmzmouaqpahxgjqcqbmcmmqfgjquxpaofhmajbbzoucrzxsvmqpsprcquhuvzmduccfuqzzumcosoqpfdujqamjvbgruhpcsxmbmrhuqzxvpasbmbvhvozmqzjuqxcdphumucrqraqcfxmupozsfagpujbkquujtyzaqhxsrmmrczuxjazbmdvuofqqzmoupvaupbccughqjspftdnpsauiuzjbqhjrxquouacumcbsovahzrpdmppqsfgumfzmvcqxkibgehsrybspcxuuzsvfazomudqqcargoxhmqrjzupjfbmbqpumhcvdvgvsuxpphzxcuobumdmrohcrfqmufqpqbzamqcujajszbwuacpiqjburmqoxgqzmppruhocbcuzfvpqvudhsxaqmzscmafujqzftaqxvmpcrzuosqjcouzbhcupzjqhvuuqsrfpmxmdmbfgaseususaqfvfmmzgzpduouqrchazphjxbjrcumxqqbcpovmfvhsmbrmdjuuzqaccxupavmfgxzpmqsoqchupqzojurbwuwlassjxqmzouujmrsbzgjqhfbazcuvuscdupvommprqhpqafxcxrombmzpcupvgqofchzxuqapmhqsqufdzuusmjjvabcrcjuyqzuqbdmxvrbammschxmuofjrzavpchcpuopzqsfgjuqubyzdfqoxhqcuqjmacrufsaqhobuzpxsdmzvpzmbrmgcpvuujnviomrruagjuvpmcjpcfvqxafmrhxsmoquushzzupqczobbdqmoirpyaoxbcofmqrvzhzppjcmxfjguvaqqbosmqudruhuzcmuaspqojhsouzasmagxfcrmmzbpdxuqphcbfpjmurcvzvquuqaqqodhwegxaopmxpzzhmqkirocqqxbmhpsovzrzafqazjcgurbmjcuhsmpfxupomvqudukwusyqrnpgaghfstqorpfoscubopvmqujbquuqzfqarxhmcacszmzjhpgxmdvuxacgbcvosmzpdmuvfhfqbuoxrpqqpjzcrumjhmqusuazojqbummhuumgbmfxvopjarxzrqsccqzpfavuudscpzhqkllznuchafrcgvaquhvcfumqbmzpuusqzboxjrzqspmopdjmxpmcqcpuqrfojbhzpuaufvmzmzbjduraqmxhsxgouscvqubpqahbzxufcmmjovcrqzcuavzqrmpoxjphsudqmfsugvtnnywlqqjbnpchczomqvmvrzgmcaxujbduufurqsmqbqxhszfappuojcoxvbbjzjrhpmuhzsazfrqdvxfumgumcqsqpmcauoqupsuudqschpqhavoabqrzmczpbjuqoxjpmrffxvugummczobhyfcvdcxzvqbpujjgmfapocxocumvfhruqamhmzqspusqruzdbbtcobxqxqhougmzbpspmuvdcfqmupjufajcvuszarzmhrqvjshxazamvcpduvqfbphbcuuczoqqgosfrpzjruxmjumqmpxcormujmcqjqsmfodusbzguaazvhqpfhmurqcpvzxubwazhughkpoxupqpbgzxauarmmbrdzfcfvuvscqqmpjmuhzjcqohuslclexozhfqxhvouaruqcpdcqubuqzcspouapjmrvfjxmmbzmsgxjkygpaiuzqfxwxnolmrbsjqquujuupafzvmammvzqqxgsphuzdmorchcpxfcbosujqucpamovmuzomdgzpfchcfbvapqzxqxqmubhsrjurtchqgwnrrxcujauhfsopxmcmjzumoaqzqvhrmfrbuppqusgvdqzbxc";
        String pat = "cujauhfsopxmcmjzumoaqzqvhrmfrbuppqusgvdqzbxc";

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < pat.length(); i++) {
            mp.put(pat.charAt(i), mp.getOrDefault(pat.charAt(i), 0) + 1);
        }

        int count = mp.size();

        int i = 0;
        int j = 0;

        int ans = 0;

        while (j < txt.length()) {

            if (mp.get(txt.charAt(j)) != null) {
                mp.put(txt.charAt(j), mp.getOrDefault(txt.charAt(j), 0) - 1);

                if (mp.getOrDefault(txt.charAt(j), 0) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < pat.length()) {
                j++;
            } else if (j - i + 1 == pat.length()) {

                if (count == 0) {
                    ans++;
                }

                if (mp.get(txt.charAt(i)) != null) {
                    mp.put(txt.charAt(i), mp.getOrDefault(txt.charAt(i), 0) + 1);
                    if (mp.getOrDefault(txt.charAt(i), 0) == 1) {
                        count++; 
                    }
                }

                i++;
                j++;
            }

        }

        System.out.println(ans);
    }
}