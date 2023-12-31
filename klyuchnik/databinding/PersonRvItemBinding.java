// Generated by view binder compiler. Do not edit!
package com.example.klyuchnik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.klyuchnik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PersonRvItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView idTVAudienceNumber;

  @NonNull
  public final TextView idTVCardNumber;

  @NonNull
  public final TextView idTVFullName;

  @NonNull
  public final TextView idTVTime;

  private PersonRvItemBinding(@NonNull CardView rootView, @NonNull TextView idTVAudienceNumber,
      @NonNull TextView idTVCardNumber, @NonNull TextView idTVFullName,
      @NonNull TextView idTVTime) {
    this.rootView = rootView;
    this.idTVAudienceNumber = idTVAudienceNumber;
    this.idTVCardNumber = idTVCardNumber;
    this.idTVFullName = idTVFullName;
    this.idTVTime = idTVTime;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PersonRvItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PersonRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.person_rv_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PersonRvItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.idTVAudienceNumber;
      TextView idTVAudienceNumber = ViewBindings.findChildViewById(rootView, id);
      if (idTVAudienceNumber == null) {
        break missingId;
      }

      id = R.id.idTVCardNumber;
      TextView idTVCardNumber = ViewBindings.findChildViewById(rootView, id);
      if (idTVCardNumber == null) {
        break missingId;
      }

      id = R.id.idTVFullName;
      TextView idTVFullName = ViewBindings.findChildViewById(rootView, id);
      if (idTVFullName == null) {
        break missingId;
      }

      id = R.id.idTVTime;
      TextView idTVTime = ViewBindings.findChildViewById(rootView, id);
      if (idTVTime == null) {
        break missingId;
      }

      return new PersonRvItemBinding((CardView) rootView, idTVAudienceNumber, idTVCardNumber,
          idTVFullName, idTVTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
