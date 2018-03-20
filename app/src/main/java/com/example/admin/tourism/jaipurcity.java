package com.example.admin.tourism;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class jaipurcity extends AppCompatActivity {
    int pressedButtonNumber;
    TextView t;
    final Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_jaipurcity);
        pressedButtonNumber = getIntent().getExtras().getInt("buttonNumber");
        Button b = (Button) findViewById(R.id.get);
        Button b1 = (Button) findViewById(R.id.map);
        Button b2 = (Button) findViewById(R.id.visit);
        Button b3 = (Button) findViewById(R.id.call);
        Button b4 = (Button) findViewById(R.id.near);

        switch (pressedButtonNumber) {
            case 1:
                setTitle("AMER FORT");
                ImageView image = (ImageView) findViewById(R.id.imageView7);
                image.setImageResource(R.drawable.aamer);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + " Amer Fort is a fort located in Amer, Rajasthan, India. Amer is a town with an area of 4 square kilometres located 11 kilometres from Jaipur, the capital of Rajasthan. Located high on a hill, it is the principal tourist attraction in Jaipur. The town of Amer was originally built by Meenas, and later it was ruled by Raja Man Singh I (December 21, 1550 – July 6, 1614). The fort overlooks Maota Lake, which is the main source of water for the Amer Palace." + "\n\n" + "Opening hours:8 AM to 9:15 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9855, 75.8513"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9855, 75.8513"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
               b3.setOnClickListener(new View.OnClickListener() {
                   @SuppressLint("MissingPermission")
                   @Override
                   public void onClick(View view) {


                       String phone = "01412530293";
                       Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                       startActivity(intent);
                               }
                           });
               b4.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       try {
                           Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                           Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                           mapIntent.setPackage("com.google.android.apps.maps");
                           startActivity(mapIntent);
                       } catch (android.content.ActivityNotFoundException anfe) {
                           getApplicationContext().startActivity(new Intent(
                                   Intent.ACTION_VIEW,
                                   Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                       }


                   }
               });


                break;
            case 2:
                setTitle("JANTAR MANTAR");
                ImageView img = (ImageView) findViewById(R.id.imageView7);
                img.setImageResource(R.drawable.jantarmantar);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n"+"The Jantar Mantar monument in Jaipur, Rajasthan is a collection of nineteen architectural astronomical instruments, built by the Rajput king Sawai Jai Singh II, and completed in 1734. It features the world largest stone sundial, and is a UNESCO World Heritage site. It is located near City Palace and Hawa Mahal of Jaipur, the monument features masonry, stone and brass instruments that were built using astronomy and instrument design principles of ancient Hindu Sanskrit texts"+ "\n\n" + "Opening hours:9 AM to 4:30 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9248, 75.8246"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9248, 75.8246"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 3:
                setTitle("NARGHARH FORT");
                ImageView image2 = (ImageView) findViewById(R.id.imageView7);
                image2.setImageResource(R.drawable.nahargarhfort);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Nahargarh Fort stands on the edge of the Aravalli Hills, overlooking the city of Jaipur in the Indian state of Rajasthan. Along with Amer Fort and Jaigarh Fort, Nahargarh once formed a strong defense ring for the city. The fort was originally named Sudarshangarh, but it became known as Nahargarh, which means 'abode of tigers'. The popular belief is that Nahar here stands for Nahar Singh Bhomia, whose spirit haunted the place and obstructed construction of the fort. Nahar's spirit was pacified by building a temple in his memory within the fort, which thus became known by his name." + "\n\n" + "Opening hours:10 AM to 5:30 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9372, 75.8152"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9372, 75.8152"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });

                break;



            case 4:
                setTitle("HAWA MAHAL");
                ImageView image3 = (ImageView) findViewById(R.id.imageView7);
                image3.setImageResource(R.drawable.hawamahal);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Hawa Mahal is a palace in Jaipur, India. It is constructed of red and pink sandstone. The palace sits on the edge of the City Palace, Jaipur, and extends to the zenana, or women's chambers.The structure was built in 1799 by Maharaja Sawai Pratap Singh. He was so inspired by the unique structure of Khetri Mahal that he built this grand and historical palace. It was designed by Lal Chand Ustad. Its unique five-storey exterior is akin to the honeycomb of a beehive with its 953 small windows called jharokhas decorated with intricate latticework." + "\n\n" + "Opening hours:9 AM to 5 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9239, 75.8267"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9239, 75.8267"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;


            case 5:
                setTitle("JAIGHARH FORT");
                ImageView image4 = (ImageView) findViewById(R.id.imageView7);
                image4.setImageResource(R.drawable.jaigarhfort);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Jaigarh Fort is situated on the promontory called the Cheel ka Teela (Hill of Eagles) of the Aravalli range; it overlooks the Amber Fort and the Maota Lake, near Amber in Jaipur, Rajasthan, India.The fort was built by Jai Singh II in 1726 to protect the Amber Fort and its palace complex and was named after him.The fort, rugged and similar in structural design to the Amber Fort, is also known as Victory Fort. It has a length of 3 kilometres along the north–south direction and a width of 1 kilometre." + "\n\n" + "Opening hours:8 AM to 9:15 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9851, 75.8456"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9851, 75.8456"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 6:
                setTitle("Albert Hall Museum");
                ImageView image5 = (ImageView) findViewById(R.id.imageView7);
                image5.setImageResource(R.drawable.alberthall);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "The Albert Hall Museum is a museum in Jaipur in Rajasthan, India. It is the oldest museum of the state and functions as the State museum of Rajasthan. The building is situated in Ram Niwas Garden outside the city wall opposite New gate and is a fine example of Indo-Saracenic architecture. The building was designed by Sir Samuel Swinton Jacob, assisted by Mir Tujumool Hoosein, and was opened as public museum in 1887. It is also called the Government Central Museum. Maharaja Ram Singh initially wanted this building to be a town hall, but his successor, Madho Singh II, decided it should be a museum for the art of Jaipur and included as part of the new Ram Nivas Garden. The museum has a rich collection of artifacts including paintings, carpets, ivory, stone, metal sculptures, and works in crystal." + "\n\n" + "Opening hours:9 AM to 10 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9117, 75.8195"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9117, 75.8195"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 7:
                setTitle("JAL MAHAL");
                ImageView image6 = (ImageView) findViewById(R.id.imageView7);
                image6.setImageResource(R.drawable.jalmahal);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "The Jal Mahal palace is an architectural showcase of the Rajput style of architecture on a grand scale. The building has a picturesque view of the lake itself but owing to its seclusion from land is equally the focus of a viewpoint from the Man Sagar Dam on the eastern side of the lake in front of the backdrop of the surrounding Nahargarh (\"tiger-abode\") hills. The palace, built in red sandstone, is a five storied building, of which four floors remain underwater when the lake is full and the top floor is exposed.One rectangular Chhatri on the roof is of the Bengal type. The chhatris on the four corners are octagonal." + "\n\n" + "Opening hours:24 Hours " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9656, 75.8592"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9656, 75.8592"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 8:

                setTitle("CITY PALACE");
                ImageView image7 = (ImageView) findViewById(R.id.imageView7);
                image7.setImageResource(R.drawable.citypalace);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "City Palace, Jaipur, which includes the Chandra Mahal and Mubarak Mahal palaces and other buildings, is a palace complex in Jaipur, the capital of the Rajasthan state, India. It was the seat of the Maharaja of Jaipur, the head of the Kachwaha Rajput clan. The Chandra Mahal palace now houses a museum, but the greatest part of it is still a royal residence. The palace complex, located northeast of the centre of the grid-patterned Jaipur city, incorporates an impressive and vast array of courtyards, gardens and buildings. The palace was built between 1729 and 1732, initially by Sawai Jai Singh II, the ruler of Amber. He planned and built the outer walls, and later additions were made by successive rulers continuing up to the 20th century." + "\n\n" + "Opening hours:24 Hours " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9258, 75.8237"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9258, 75.8237"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });

                break;
            case 9:
                setTitle("Birla Temple");
                ImageView image8 = (ImageView) findViewById(R.id.imageView7);
                image8.setImageResource(R.drawable.birlamandir);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Birla Temple, Jaipur At the foot of Moti Dungri fort is the Birla Temple. This temple forms one of the most beautiful attractions of Jaipur. Birla Temple of Jaipur looks stunning, when it is brightly lit in the night. The construction of the temple started in 1977 and it went on till 1985. On 22nd February 1985, the temple deity was invoked and was opened for public to visit. the temple was built by Birla Group of Industries, one of the business tycoons of India. The Temple is dedicated to Lord Vishnu (Narayan), the preserver and his consort Lakshmi, the Goddess of wealth. Due to this reason, Birla Temple is also known as Laxmi Narayan Temple. Birla Mandir is constructed in the finest quality of white marble." + "\n\n" + "Opening hours:8 AM to 9:15 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.8922, 75.8155"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.8922, 75.8155"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 10:
                setTitle("Rambagh Palace");
                ImageView image9 = (ImageView) findViewById(R.id.imageView7);
                image9.setImageResource(R.drawable.rambagh);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "The Rambagh Palace in Jaipur, Rajasthan is the former residence of the Maharaja of Jaipur and now a hotel, located 8.0 km outside the walls of the city of Jaipur on Bhawani Singh Road. The first building on the site was a garden house built in 1835 for the wet nurse of prince Ram Singh II." + "\n\n" + "Opening hours:8 AM to 9:15 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.8983, 75.8086"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.8983, 75.8086"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412385700";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 11:
                setTitle("Jaipur Zoo");
                ImageView image10 = (ImageView) findViewById(R.id.imageView7);
                image10.setImageResource(R.drawable.zoo);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Jaipur Zoo is a in city of Jaipur in Rajasthan state in India. The zoo was opened in 1877 and is located near to the Albert Hall Museum. It is divided into two parts: one for mammals and other for birds and reptiles. Nearly 50 species of different birds and animals from all over the world can be seen here. In year 1999, the ghariyal breeding farm is established which is fourth largest breeding farm in India. A museum was also constructed inside the zoo which exhibits the wildlife of Rajasthan. The Jaipur Zoo has been constituted under the Wild Life (Protection) Act. The main objective of the zoo is to complement the national effort in conservation of wild life. The Jaipur Zoo is located near Albert Hall and Ram Nivas Garden." + "\n\n" + "Opening hours:9 AM to 5 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9123, 75.8212"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9123, 75.8212"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });


                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });

                break;
            case 12:
                setTitle("Ram Niwas Garden");
                ImageView image11 = (ImageView) findViewById(R.id.imageView7);
                image11.setImageResource(R.drawable.ramniwas);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Ram Niwas Garden is a garden situated in Jaipur city in Indian state of Rajasthan, built by Maharaja Sawai Ram Singh of Jaipur in 1868. The historical garden is located in the heart of the city and covers an area of 33 acres (130,000 m2), and was built by Maharaja Sawai Ram Singh in 1868.Within the garden which originally spread over 76 acres (310,000 m2) in early 20th century is the Albert Hall Museum (now known as Central Museum), named after King Edward VII (Albert Edward), during whose visit to the city as the Prince of Wales, its foundation stone was laid on February 6, 1876." + "\n\n" + "Opening hours:5 AM to 8 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9150, 75.8179"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9150, 75.8179"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;
            case 13:
                setTitle("Raj Mandir Cinema");
                ImageView image12 = (ImageView) findViewById(R.id.imageView7);
                image12.setImageResource(R.drawable.rajmandir);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Raj Mandir Cinema is a movie theatre in Jaipur in Rajasthan state in India.[2] Situated on the Bhagwan Das Road, near M.I. Road, the meringue-shaped auditorium opened in 1976, and over the years has seen many movie premieres of Hindi films, and has become a popular symbol of Jaipur. It opened on 1 June 1976 with the film \"Charas\". It was designed by architect W.M. Namjoshi in Art Moderne style (Streamline Moderne or late Art Deco). Known for its large size as well as opulent and meringue interiors, Raj Mandir remains an important part of the tourist circuit, and thus usually remains full despite its size." + "\n\n" + "Opening hours: Shows Timings " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9154, 75.8101"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9154, 75.8101"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });


                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });

                break;

            case 14:
                setTitle("Mubarak Mahal");
                ImageView image13 = (ImageView) findViewById(R.id.imageView7);
                image13.setImageResource(R.drawable.mubarakmahal);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Mubarak Mahal: This is located in the first courtyard of City Palace. This Mahal was built by Maharaja Madho Singh II in the late 19th Century. This Mahal is also known as the Auspicious Palace. This Mahal contains the textiles of the Maharaja Sawai Man Singh II museum. Mubarak Mahal contains the architectural charm of the medieval India. This fabulous manor was built by the Rajputs of earlier times. Mubarak Mahal is a dazzling large Haveli which is famous for its structural charm. This haveli contains spacious rooms in it and the most attractive thing in this haveli is the reception hall, which has lovely things of Murals in it. The regal outlook is very beautiful. The ornamental pillers of it and its highly carved furniture are worth watching. You  can see a fabulous gateway here which directly takes out to the Diwan-I-Khas." + "\n\n" + "Opening hours:8 AM to 9:15 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.9534, 75.8461"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9534, 75.8461"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;

            case 15:
                setTitle("Jawahar Kala Kendra");
                ImageView image14 = (ImageView) findViewById(R.id.imageView7);
                image14.setImageResource(R.drawable.jawarkalakendra);
                t = (TextView) findViewById(R.id.jp);
                t.setText("\n" + "Jawahar Kala Kendra (JKK) is a multi arts centre located in Jaipur in India. It was built by Rajasthan government with the purpose of preserving Rajasthani arts and crafts. The centre has been made in eight blocks housing museums, one amphi theatre and the other closed auditorium, library, arts display rooms, cafeteria, small hostel and art-studio. It also houses two permanent art galleries and three other galleries. and host its own theatre festival each year." + "\n\n" + "Closes 6 PM " + "\n\n");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=26.8763, 75.8092"));
                            startActivity(intent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.8763, 75.8092"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }

                    }

                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cab.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onClick(View view) {


                        String phone = "01412530293";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("26.9183, 75.7900"));
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            startActivity(mapIntent);
                        } catch (android.content.ActivityNotFoundException anfe) {
                            getApplicationContext().startActivity(new Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps")));
                        }


                    }
                });


                break;









        }
    }
}
