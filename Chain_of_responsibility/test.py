a = [('яєшня', 'noun'), ('ланч', 'noun'), ('яриця', 'noun'), ('лютня', 'noun'), ('лобі', 'noun'), ('чапля', 'noun'), ('людці', 'noun'), ('ламач', 'noun'), ('чуття', 'noun'), ('ярі', 'noun'), ('лічі', 'noun'), ('люшня', 'noun'), ('чвал', 'noun'), ('ярові', 'noun'), ('чаєня', 'noun'), ("луб'я", 'noun'), ('єті', 'noun'), ('лея', 'noun'), ('ягня', 'noun'), ('ялиця', 'noun'), ('літія', 'noun'), ('чувал', 'noun'), ('лижня', 'noun'), ('янкі', 'noun'), ('чохол', 'noun'), ('івасі', 'noun'), ('чері', 'noun'), ("ім'я", 'noun'), ('чуня', 'noun'), ('лоція', 'noun'), ('лелія', 'noun'), ('лізол', 'noun'), ('ліція', 'noun'), ('лиття', 'noun'), ('індол', 'noun'), ('леді', 'noun'), ('ідеал', 'noun'), ('ляля', 'noun'), ('янгол', 'noun'), ('іонол', 'noun'), ('ленч', 'noun'), ('лаття', 'noun'), ('литія', 'noun'), ('латач', 'noun'), ('лілія', 'noun'), ('япі', 'noun'), ('чилі', 'noun'), ('яппі', 'noun'), ("лев'я", 'noun'), ('читач', 'noun'), ('ял', 'noun'), ('лазня', 'noun'), ('ля', 'noun'), ('ледач', 'noun'), ('ідея', 'noun'), ('лілея', 'noun'), ('ітися', 'verb'), ('лихач', 'noun'), ('лорі', 'noun'), ('льє', 'noun'), ('льоля', 'noun'), ('ловля', 'noun'), ('чвиря', 'noun'), ('чиря', 'noun'), ('яєчня', 'noun'), ('іжиця', 'noun'), ('ларі', 'noun'), ('іноді', 'adverb'), ('лінія', 'noun'), ('чортя', 'noun'), ('листя', 'noun'), ('ідол', 'noun'), ('ліві', 'noun'), ('іксія', 'noun')]
b = [('єті', 'noun'), ('івасі', 'noun'), ('ідеал', 'noun'), ('ідея', 'noun'), ('ідол', 'noun'), ('іжиця', 'noun'), ('іксія', 'noun'), ("ім'я", 'noun'), ('індол', 'noun'), ('іонол', 'noun'), ('ітися', 'verb'), ('лазня', 'noun'), ('ламач', 'noun'), ('ланч', 'noun'), ('ларі', 'noun'), ('латач', 'noun'), ('лаття', 'noun'), ("лев'я", 'noun'), ('ледач', 'noun'), ('леді', 'noun'), ('лелія', 'noun'), ('ленч', 'noun'), ('лея', 'noun'), ('лижня', 'noun'), ('листя', 'noun'), ('литія', 'noun'), ('лиття', 'noun'), ('лихач', 'noun'), ('ліві', 'noun'), ('лізол', 'noun'), ('лілея', 'noun'), ('лілія', 'noun'), ('лінія', 'noun'), ('літія', 'noun'), ('ліція', 'noun'), ('лічі', 'noun'), ('лобі', 'noun'), ('ловля', 'noun'), ('лорі', 'noun'), ('лоція', 'noun'), ("луб'я", 'noun'), ('льє', 'noun'), ('льоля', 'noun'), ('людці', 'noun'), ('лютня', 'noun'), ('люшня', 'noun'), ('ля', 'noun'), ('ляля', 'noun'), ('чаєня', 'noun'), ('чапля', 'noun'), ('чвал', 'noun'), ('чвиря', 'noun'), ('чері', 'noun'), ('чилі', 'noun'), ('чиря', 'noun'), ('читач', 'noun'), ('чортя', 'noun'), ('чохол', 'noun'), ('чувал', 'noun'), ('чуня', 'noun'), ('чуття', 'noun'), ('ягня', 'noun'), ('яєчня', 'noun'), ('яєшня', 'noun'), ('ял', 'noun'), ('ялиця', 'noun'), ('янгол', 'noun'), ('янкі', 'noun'), ('япі', 'noun'), ('яппі', 'noun'), ('яриця', 'noun'), ('ярі', 'noun'), ('ярові', 'noun')]
a_s = set(a)
b_s = set(b)
cout = 0
for word in a:
    if word in b:
        cout +=1
print(cout)